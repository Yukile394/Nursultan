package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class08682 extends class08672<class08665> {
   private final class01781 y;

   public class08682(class01422 var1, class01781 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   protected String y() {
      return "entity";
   }

   @Override
   protected float N(int var1, int var2) {
      return var1 / 2.0F;
   }

   protected void N(class08665 var1, class01421 var2) {
      ((class03386)class06202.Nq().i_5).v().N(class01540.field_60028);
      Vector3f vector3f = var1.L();
      var2.N(vector3f.x, vector3f.y, vector3f.z);
      var2.N(var1.u());
      Quaternionf quaternionf = var1.z();
      class08133 class08133 = ((class03386)class06202.Nq().i_5).L();
      class06959 class06959 = new class06959();
      if (quaternionf != null) {
         class06959.i = quaternionf.conjugate(new Quaternionf()).rotateY((float) Math.PI);
      }

      this.y.N(var1.y(), class06959, 0.0, 0.0, 0.0, var2, class08133.L());
      class08133.N();
   }

   @Override
   public Class<class08665> N() {
      return class08665.class;
   }
}
