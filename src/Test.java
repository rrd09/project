class Test {

   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               view.GUI gui = new view.GUI();
           }
       });
   }

}