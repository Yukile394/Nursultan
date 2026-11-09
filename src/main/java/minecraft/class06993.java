package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum class06993 implements class05033 {
   field_11467(0, "none", class01372.field_23292),
   field_11463(1, "clockwise_90", class01372.field_23318),
   field_11464(2, "180", class01372.field_23300),
   field_11465(3, "counterclockwise_90", class01372.field_23319);

   public static final IntFunction<class06993> field_55986 = class02121.N(class06993::y, values(), class02126.field_41665);
   public static final Codec<class06993> field_39313 = class05033.N(class06993::values);
   public static final class02362<ByteBuf, class06993> field_55987 = class02389.N(field_55986, class06993::y);
   @Deprecated
   public static final Codec<class06993> field_56670 = class06338.L(class06993::valueOf);
   private final int field_55988;
   private final String field_39314;
   private final class01372 field_23264;

   private class06993(int var3, String var4, class01372 var5) {
      this.field_55988 = var3;
      this.field_39314 = var4;
      this.field_23264 = var5;
   }

   private int y() {
      return this.field_55988;
   }

   public static List<class06993> y(class06069 var0) {
      return class07536.y(values(), var0);
   }

   public int N(int var1, int var2) {
      return switch (this) {
         case field_11463 -> (var1 + var2 / 4) % var2;
         case field_11464 -> (var1 + var2 / 2) % var2;
         case field_11465 -> (var1 + var2 * 3 / 4) % var2;
         default -> var1;
      };
   }

   public class01372 N() {
      return this.field_23264;
   }

   public class07211 N(class07211 var1) {
      if (var1.z() == class07185.field_11052) {
         return var1;
      } else {
         return switch (this) {
            case field_11463 -> var1.R();
            case field_11464 -> var1.b();
            case field_11465 -> var1.M();
            default -> var1;
         };
      }
   }

   public static class06993 N(class06069 var0) {
      return class07536.N((class06993[])values(), var0);
   }

   public class06993 N(class06993 var1) {
      return switch (var1) {
         case field_11463 -> {
            switch (this) {
               case field_11467:
                  yield field_11463;
               case field_11463:
                  yield field_11464;
               case field_11464:
                  yield field_11465;
               case field_11465:
                  yield field_11467;
               default:
                  throw new MatchException(null, null);
            }
         }
         case field_11464 -> {
            switch (this) {
               case field_11467:
                  yield field_11464;
               case field_11463:
                  yield field_11465;
               case field_11464:
                  yield field_11467;
               case field_11465:
                  yield field_11463;
               default:
                  throw new MatchException(null, null);
            }
         }
         case field_11465 -> {
            switch (this) {
               case field_11467:
                  yield field_11465;
               case field_11463:
                  yield field_11467;
               case field_11464:
                  yield field_11463;
               case field_11465:
                  yield field_11464;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> this;
      };
   }

   @Override
   public String method_15434() {
      return this.field_39314;
   }
}
