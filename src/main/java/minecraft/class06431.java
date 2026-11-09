package minecraft;

import it.unimi.dsi.fastutil.longs.LongSets;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class06431 implements class01285 {
   public static final class01894 N = class01894.y("position");

   public class06431() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      class07049 class07049 = class06202.F();
      if (class07049 != null) {
         class07209 class07209 = class06202.F().method_24515();
         class07321 class07321 = new class07321(class07209);
         class07211 class07211 = class07049.method_5735();

         String s = switch (class07211) {
            case field_11043 -> "Towards negative Z";
            case field_11035 -> "Towards positive Z";
            case field_11039 -> "Towards negative X";
            case field_11034 -> "Towards positive X";
            default -> "Invalid";
         };
         Object object = var2 instanceof class04782 ? ((class04782)var2).method_17984() : LongSets.EMPTY_SET;
         var1.N(
            N,
            List.of(
               String.format(
                  Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", class06202.F().method_23317(), class06202.F().method_23318(), class06202.F().method_23321()
               ),
               String.format(Locale.ROOT, "Block: %d %d %d", class07209.method_10263(), class07209.method_10264(), class07209.method_10260()),
               String.format(
                  Locale.ROOT,
                  "Chunk: %d %d %d [%d %d in r.%d.%d.mca]",
                  class07321.B,
                  class01296.N(class07209.method_10264()),
                  class07321.Z,
                  class07321.U(),
                  class07321.E(),
                  class07321.Z(),
                  class07321.z()
               ),
               String.format(
                  Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", class07211, s, class04995.R(class07049.method_36454()), class04995.R(class07049.method_36455())
               ),
               ((class03448)class06202.T_3).method_27983().N() + " FC: " + object.size()
            )
         );
      }
   }
}
