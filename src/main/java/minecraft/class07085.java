package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum class07085 implements class05033 {
   field_6173(class07043.field_6177, 0, 0, "mainhand"),
   field_6171(class07043.field_6177, 1, 5, "offhand"),
   field_6166(class07043.field_6178, 0, 1, 1, "feet"),
   field_6172(class07043.field_6178, 1, 1, 2, "legs"),
   field_6174(class07043.field_6178, 2, 1, 3, "chest"),
   field_6169(class07043.field_6178, 3, 1, 4, "head"),
   field_48824(class07043.field_48825, 0, 1, 6, "body"),
   field_55946(class07043.field_55947, 0, 1, 7, "saddle");

   public static final int field_51935 = 0;
   public static final List<class07085> field_54086 = List.of(values());
   public static final IntFunction<class07085> field_54087 = class02121.N(var0 -> var0.field_54089, values(), class02126.field_41664);
   public static final class05031<class07085> field_45739 = class05033.N(class07085::values);
   public static final class02362<ByteBuf, class07085> field_54088 = class02389.N(field_54087, var0 -> var0.field_54089);
   private final class07043 field_6170;
   private final int field_6168;
   private final int field_51936;
   private final int field_54089;
   private final String field_6175;

   public int L() {
      return this.field_54089;
   }

   private class07085(class07043 var3, int var4, int var5, String var6) {
      this(var3, var4, 0, var5, var6);
   }

   private class07085(class07043 var3, int var4, int var5, int var6, String var7) {
      this.field_6170 = var3;
      this.field_6168 = var4;
      this.field_51936 = var5;
      this.field_54089 = var6;
      this.field_6175 = var7;
   }

   public boolean i() {
      return this.field_6170 == class07043.field_6178 || this.field_6170 == class07043.field_48825;
   }

   public String u() {
      return this.field_6175;
   }

   public int y(int var1) {
      return this.field_54089 + var1;
   }

   public int y() {
      return this.field_6168;
   }

   public static class07085 N(String var0) {
      class07085 class07085 = field_45739.N(var0);
      if (class07085 != null) {
         return class07085;
      } else {
         throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
      }
   }

   public class07043 N() {
      return this.field_6170;
   }

   public int N(int var1) {
      return var1 + this.field_6168;
   }

   public class06584 N(class06584 var1) {
      return this.field_51936 > 0 ? var1.N(this.field_51936) : var1;
   }

   public boolean R() {
      return this.field_6170 != class07043.field_55947;
   }

   @Override
   public String method_15434() {
      return this.field_6175;
   }
}
