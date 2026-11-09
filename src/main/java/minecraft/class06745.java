package minecraft;

public record class06745(class06889 pos, float radius, class06747 style) implements class06730 {
   private static final int u = 20;
   private static final float i = (float) (Math.PI / 10);

   public class06747 L() {
      return this.style;
   }

   public class06745(class06889 pos, float radius, class06747 style) {
      super();
      this.pos = pos;
      this.radius = radius;
      this.style = style;
   }

   public float y() {
      return this.radius;
   }

   public class06889 N() {
      return this.pos;
   }

   @Override
   public void N(class06722 var1, float var2) {
      if (this.style.y() || this.style.N()) {
         class06889[] aclass06889 = new class06889[21];

         for (int ix = 0; ix < 20; ix++) {
            float f = ix * (float) (Math.PI / 10);
            class06889 class06889 = this.pos.y((float)(this.radius * Math.cos(f)), 0.0, (float)(this.radius * Math.sin(f)));
            aclass06889[ix] = class06889;
         }

         aclass06889[20] = aclass06889[0];
         if (this.style.N()) {
            int j = this.style.y(var2);
            var1.N(aclass06889, j);
         }

         if (this.style.y()) {
            int k = this.style.N(var2);

            for (int l = 0; l < 20; l++) {
               var1.N(aclass06889[l], aclass06889[l + 1], k, this.style.u());
            }
         }
      }
   }
}
