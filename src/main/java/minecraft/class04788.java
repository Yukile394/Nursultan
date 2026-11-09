package minecraft;

import java.util.Vector;
import javax.swing.JList;

public class class04788 extends JList<String> {
   private final class02796 N;
   private int y;

   public class04788(class02796 var1) {
      super();
      this.N = var1;
      var1.Z(this::N);
   }

   public void N() {
      if (this.y++ % 20 == 0) {
         Vector vector = new Vector();

         for (int i = 0; i < this.N.Nm().v().size(); i++) {
            vector.add(this.N.Nm().v().get(i).method_7334().name());
         }

         this.setListData(vector);
      }
   }
}
