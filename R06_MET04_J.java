public class R06_MET04_J {
    class Super {
        protected void doLogic() {
            System.out.println("Super invoked");
        }
    }

    public class Sub extends Super {
        public void doLogic() {
            System.out.println("Sub invoked");
            // Do sensitive operations
        }
    }
}