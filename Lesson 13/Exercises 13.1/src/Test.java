class Test {
    public static void main(String[] args) {
        new Programmer(1);

    }

    public static class TeamLead {
        private int numTeamLead;

        public TeamLead(int numTeamLead) {
            this.numTeamLead = numTeamLead;
            employ();
        }
@Override
        public void employ() {
            System.out.println(numTeamLead + " teamlead");
        }
    }

    public static class Programmer extends TeamLead {
        private int numProgrammer;

        public Programmer(int numProgrammer) {
            super(numProgrammer);
            this.numProgrammer = numProgrammer;
            employ();
        }
@Override
        protected void employ() {

            System.out.println(numProgrammer + " programmer");
        }
    }
}