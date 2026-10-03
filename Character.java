package MarioKart;

abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;

    }

    public void throwAnItem() {
        System.out.println("Character throws generic item!");

    }

}

    class Luigi extends Character {
        private String mustacheStyle;

        public Luigi(String name, String mustacheStyle) {
            super(name);
            this.mustacheStyle = mustacheStyle;
        }

        @Override
        public void throwAnItem() {
            System.out.println("Luigi throws a Green Shell! (Mustache Style: Curly)");
        }
    }

        class Toad extends Character {
            private int speedBoost;
          public Toad (String name, int speedBoost){
              super(name);
              this.speedBoost = speedBoost;

          }
          @Override
            public void throwAnItem(){
              System.out.println("Toad throws a Banana Peel!(Speed Boost 20%)");
          }

        }

        class PrincessPeach extends Character {
            private String dressColor;
            public PrincessPeach (String name, String dressColor) {
                super("princess Peach");
                this.dressColor = dressColor;
            }
            @Override
            public void throwAnItem() {
                System.out.println("Princess Peach throws a red Shell! (Dress Color: Pink)");
            }
        }





