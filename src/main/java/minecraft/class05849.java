package minecraft;

public enum class05849 implements class05879 {
   field_17558(class01339::y),
   field_17559(class01339::N),
   field_23142(class01339::L),
   field_36337((var0, var1, var2, var3) -> {
      if (var0.N(class01210.yi)) {
         return class00389.y();
      } else {
         if (var3 instanceof class06093 class06093 && class06093.R() != null && class06093.R().method_5864() == class07078.Ly) {
            if (var0.N(class00869.EY) || var0.N(class00869.MW)) {
               return class00389.y();
            }

            if (var1 instanceof class04782 class04782 && var0.N(class00869.iq) && class04782.method_64395().N(class07305.K) == 0) {
               return class00389.y();
            }
         }

         return class00389.N();
      }
   });

   private final class05879 field_17560;

   private class05849(class05879 var3) {
      this.field_17560 = var3;
   }

   @Override
   public class00494 get(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.field_17560.get(var1, var2, var3, var4);
   }
}
