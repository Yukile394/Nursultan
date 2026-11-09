package minecraft;

import Nursultan.class10668;
import Nursultan.class10671;
import Nursultan.class10672;
import org.joml.Matrix4f;

public class class06732 implements class06722 {
   private final class06720 N = new class06720(true);
   private final class06720 y = new class06720(false);
   private boolean L = true;

   public class06732() {
      super();
   }

   @Override
   public void N(class06889 var1, class06889 var2, class06889 var3, class06889 var4, int var5) {
      this.N(var5).L().add(new class06754(var1, var2, var3, var4, var5));
      this.L = false;
   }

   @Override
   public void N(class06889 var1, String var2, class06715 var3) {
      this.N(var3.y()).i().add(new class10672(var1, var2, var3));
      this.L = false;
   }

   public void N(class01421 var1, class01407 var2, class06959 var3, Matrix4f var4) {
      this.N.N(var1, var2, var3, var4);
      this.y.N(var1, var2, var3, var4);
   }

   public boolean N() {
      return this.L;
   }

   private class06720 N(int var1) {
      return class02566.y(var1) < 255 ? this.y : this.N;
   }

   @Override
   public void N(class06889 var1, int var2, float var3) {
      this.N(var2).R().add(new class10671(var1, var2, var3));
      this.L = false;
   }

   @Override
   public void N(class06889 var1, class06889 var2, int var3, float var4) {
      this.N(var3).y().add(new class10668(var1, var2, var3, var4));
      this.L = false;
   }

   @Override
   public void N(class06889[] var1, int var2) {
      this.N(var2).u().add(new class06752(var1, var2));
      this.L = false;
   }
}
