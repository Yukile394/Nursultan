package minecraft;

import org.lwjgl.openal.AL10;

public class class06310 {
   private class03836 N;

   public class06310() {
      super();
      this.N = class03836.N;
   }

   public class03836 y() {
      return this.N;
   }

   public void N(class03836 var1) {
      this.N = var1;
      class06889 class06889xx = var1.y();
      class06889 class06889x = var1.L();
      class06889 class06889xx = var1.u();
      AL10.alListener3f(4100, (float)class06889xx.M, (float)class06889xx.B, (float)class06889xx.Z);
      AL10.alListenerfv(
         4111,
         new float[]{
            (float)class06889x.M, (float)class06889x.B, (float)class06889x.Z, (float)class06889xx.N(), (float)class06889xx.y(), (float)class06889xx.L()
         }
      );
   }

   public void N() {
      this.N(class03836.N);
   }
}
