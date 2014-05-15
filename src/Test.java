class Test {

   public static void main(String[] args) {
       model.SeniorLecturer lecturer = new model.SeniorLecturer("Adam");
       System.out.println("Hi " + lecturer.getName() + "!");
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               view.GUI gui = new view.GUI();
           }
       });
   }

}