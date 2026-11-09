package minecraft;

import java.util.ArrayList;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

public class class05586 implements class01285 {
   private static final class01894 N = class01894.y("looking_at_fluid");

   public class05586() {
      super();
   }

   private String N(Entry<class08092<?>, Comparable<?>> var1) {
      class08092 class08092 = (class08092)var1.getKey();
      Comparable comparable = (Comparable)var1.getValue();
      Object object = class07536.N(class08092, comparable);
      if (Boolean.TRUE.equals(comparable)) {
         object = class06541.field_1060 + object;
      } else if (Boolean.FALSE.equals(comparable)) {
         object = class06541.field_1061 + object;
      }

      return class08092.R() + ": " + object;
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class07049 class07049 = class06202.Nq().F();
      Object object = class07529.NX ? var2 : (class03448)class06202.Nq().T_3;
      if (class07049 != null && object != null) {
         class07089 class07089 = class07049.method_5745(20.0, 0.0F, true);
         ArrayList arraylist = new ArrayList();
         if (class07089.N() == class07113.field_1332) {
            class07209 class07209 = ((class06183)class07089).u();
            class04688 class04688 = ((class07299)object).method_8316(class07209);
            arraylist.add(
               class06541.field_1073 + "Targeted Fluid: " + class07209.method_10263() + ", " + class07209.method_10264() + ", " + class07209.method_10260()
            );
            arraylist.add(String.valueOf(class04206.L.y(class04688.N())));

            for (Entry entry : class04688.L().entrySet()) {
               arraylist.add(this.N(entry));
            }

            class04688.E().map(var0 -> "#" + var0.y()).forEach(arraylist::add);
         }

         var1.N(N, arraylist);
      }
   }
}
