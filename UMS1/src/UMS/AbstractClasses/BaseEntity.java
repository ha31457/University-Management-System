package UMS.AbstractClasses;

    public abstract class BaseEntity {

        protected String name;
        protected int id;

        public BaseEntity(int id, String name) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public abstract void displayDetails();
    }
