package team.service;

import team.domain.Architect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;


public class TeamService {
    // Global variable to set memberId
    private static int counter = 1;
    // Max member in team
    private final int MAX_MEMBER = 5;
    // The team programmer array
    private Programmer[] team = new Programmer[MAX_MEMBER];
    // Current programmer total number
    private int total = 0;

    /**
     * @return all team members
     */
    public Programmer[] getTeam() {
        Programmer[] members = new Programmer[total];
        for (int i = 0; i < total; i++) {
            members[i] = this.team[i];
        }
        return members;
    }

    /*
     * @param e
     * @throws TeamException
     * */
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) throw new TeamException("no more");
        if (!(e instanceof Programmer)) throw new TeamException("not programmer");
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status) {
            case BUSY -> throw new TeamException("already in team");
            case VOCATION -> throw new TeamException("on vocation");
        }
        if (isExist((Programmer) e)) throw new TeamException("already in programmer team");

        int proNum, desNum, arcNum;
        proNum = desNum = arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                proNum++;
            }
        }
        if (e instanceof Architect) {
            if (arcNum >= 1) throw new TeamException("no more architect");
        } else if (e instanceof Designer) {
            if (desNum >= 2) throw new TeamException("no more designer");
        } else {
            if (proNum >= 3) throw new TeamException("no more programmer");
        }
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    /*
     * @param memberId
     * @throws TeamException
     * */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                // set programmer to free
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //Doesn't exist
        if (i == total) {
            throw new TeamException("Can not find the programmer, delete failed");
        }

        //Adjust
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j+1];
            team[--total] = null;
        }
    }

    /*
     * Is programmer in the team
     */
    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }
}
