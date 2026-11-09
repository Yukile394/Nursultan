package minecraft;

import org.jspecify.annotations.Nullable;

public class class07237 extends class00394 {
   private static final String N = "profile";
   private static final String y = "note_block_sound";
   private static final String L = "custom_name";
   @Nullable
   private class02689 u;
   @Nullable
   private class01894 i;
   private int R;
   private boolean M;
   @Nullable
   private class00392 B;

   @Nullable
   public class01894 L() {
      return this.i;
   }

   public class07237(class07209 var1, class00500 var2) {
      super(class00404.field_11913, var1, var2);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   public void y(class08329 var1) {
      super.y(var1);
      var1.L("profile");
      var1.L("note_block_sound");
      var1.L("custom_name");
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.u = var1.method_58694(class02484.Nb);
      this.i = var1.method_58694(class02484.Nj);
      this.B = var1.method_58694(class02484.B);
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.Nb, this.u);
      var1.N(class02484.Nj, this.i);
      var1.N(class02484.B, this.B);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u = var1.<class02689>N("profile", class02689.N).orElse(null);
      this.i = var1.<class01894>N("note_block_sound", class01894.N).orElse(null);
      this.B = N_10(var1, "custom_name");
   }

   public float N(float var1) {
      return this.M ? this.R + var1 : this.R;
   }

   @Nullable
   public class02689 N() {
      return this.u;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.y("profile", class02689.N, this.u);
      var1.y("note_block_sound", class01894.N, this.i);
      var1.y("custom_name", class03748.N, this.B);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07237 var3) {
      if (var2.y(class07000.N) && var2.L(class07000.N)) {
         var3.M = true;
         var3.R++;
      } else {
         var3.M = false;
      }
   }
}
