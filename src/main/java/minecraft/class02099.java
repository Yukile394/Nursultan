package minecraft;

import org.jspecify.annotations.Nullable;

public class class02099 {
   private boolean N;
   @Nullable
   private class02096 y;
   @Nullable
   private String L;
   @Nullable
   private final String u;

   public class02099(@Nullable String var1) {
      super();
      this.u = var1;
   }

   public boolean N(class02097 var1) {
      if (!this.N && this.y != null && this.L != null) {
         this.N = true;
         var1.send(class02129.L, var1x -> {
            var1x.N(class02117.m, this.y);
            if (this.u != null) {
               var1x.N(class02117.P, this.u);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void N(String var1) {
      this.L = var1;
   }

   public void N(class07282 var1, boolean var2) {
      this.y = switch (var1) {
         case field_9215 -> var2 ? class02096.field_41485 : class02096.field_41481;
         case field_9220 -> class02096.field_41482;
         case field_9216 -> class02096.field_41483;
         case field_9219 -> class02096.field_41484;
      };
   }

   public void N(class02104 var1) {
      if (this.L != null) {
         var1.N(class02117.z, !this.L.equals("vanilla"));
      }

      var1.N(class02117.U, this.N());
   }

   private class02087 N() {
      class04568 class04568 = class06202.Nq().yN();
      if (class04568 != null && class04568.i()) {
         return class02087.field_41490;
      } else {
         return class06202.Nq().v() ? class02087.field_41491 : class02087.field_41492;
      }
   }
}
