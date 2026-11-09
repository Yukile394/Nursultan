package minecraft;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class class05514 {
   public static final int N = 10;
   public static final String y = "Minecraft.Server/src/test/convertables/data";
   public static Path L = Paths.get("Minecraft.Server/src/test/convertables/data");

   public static Stream<class07209> L(class07209 var0, int var1, class04782 var2) {
      return var2.method_19494().N(var0x -> var0x.N(class03927.n), var0x -> true, var0, var1, class05372.field_18489).map(class07209::method_10062);
   }

   public class05514() {
      super();
   }

   public static class05163 y(class07209 var0, class00753 var1, class06993 var2) {
      class07209 class07209 = N(var0, var1, var2);
      class05163 class05163 = class05163.N(var0, class07209);
      int i = Math.min(class05163.B(), class05163.U());
      int j = Math.min(class05163.z(), class05163.W());
      return class05163.N(var0.method_10263() - i, 0, var0.method_10260() - j);
   }

   public static Optional<class07209> y(class07209 var0, int var1, class04782 var2) {
      Comparator comparator = Comparator.comparingInt(var1x -> var1x.method_19455(var0));
      return L(var0, var1, var2).min(comparator);
   }

   private static void N(int var0, class07209 var1, class04782 var2) {
      class00500 class00500;
      if (var1.method_10264() < var0) {
         class00500 = class00869.y.W();
      } else {
         class00500 = class00869.N.W();
      }

      new class00903(class00500, Collections.emptySet(), null).N(var2, var1, 818);
      var2.method_8408(var1, class00500.i());
   }

   public static Optional<class07209> N(class07209 var0, int var1, class04782 var2) {
      return L(var0, var1, var2).filter(var2x -> N(var2x, var0, var2)).findFirst();
   }

   public static class07209 N(class07209 var0, class00753 var1, class06993 var2) {
      return class01207.N(var0.method_10081(var1).method_10069(-1, -1, -1), class07111.field_11302, var2, var0);
   }

   public static void N(class05163 var0, class04782 var1) {
      int i = var0.Z() - 1;
      class07209.method_23627(var0).forEach(var2x -> N(i, var2x, var1));
      var1.method_14196().N(var0);
      var1.method_23658(var0);
      class00734 class00734 = class00734.N(var0);
      var1.N(class07049.class, class00734, var0x -> !(var0x instanceof class08036)).forEach(class07049::method_31472);
   }

   public static class08610 N(class01894 var0, class07209 var1, class00753 var2, class06993 var3, class04782 var4) {
      N(y(class08610.N(var1), var2, var3), var4);
      var4.method_8501(var1, class00869.Ty.W());
      class08610 class08610 = (class08610)var4.method_8321(var1);
      class05946 class05946 = class05946.N(class04227.yt, var0);
      class08610.N(new class08595(Optional.of(class05946), var2, var3, false, class08625.field_56014, Optional.empty()));
      return class08610;
   }

   private static boolean N(class07209 var0, class07209 var1, class04782 var2) {
      class00394 class00394 = var2.method_8321(var0);
      return class00394 instanceof class08610 ? ((class08610)class00394).u().y(var1) : false;
   }

   public static class06993 N(int var0) {
      switch (var0) {
         case 0:
            return class06993.field_11467;
         case 1:
            return class06993.field_11463;
         case 2:
            return class06993.field_11464;
         case 3:
            return class06993.field_11465;
         default:
            throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + var0);
      }
   }

   public static Stream<class07209> N(class07209 var0, class07049 var1, class04782 var2) {
      short short1 = 250;
      class06889 class06889x = var1.method_33571();
      class06889 class06889x = class06889x.i(var1.method_5720().L(250.0));
      return L(var0, 250, var2)
         .map(var1x -> var2.N(var1x, class00404.field_55993))
         .flatMap(Optional::stream)
         .filter(var2x -> var2x.R().y(class06889x, class06889).isPresent())
         .map(class00394::d)
         .sorted(Comparator.comparing(var0::method_10262))
         .limit(1L);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int N(class06993 var0) {
      switch (var0) {
         case field_11467:
            return 0;
         case field_11463:
            return 1;
         case field_11464:
            return 2;
         case field_11465:
            return 3;
         default:
            throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + var0);
      }
   }
}
