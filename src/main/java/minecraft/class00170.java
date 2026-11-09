package minecraft;

import com.google.common.primitives.UnsignedBytes;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

record class00170(class00150 sign, class00182 base, String digits, class00154 suffix) {

   public String L() {
      return this.digits;
   }

   class00170(class00150 sign, class00182 base, String digits, class00154 suffix) {
      this.sign = sign;
      this.base = base;
      this.digits = digits;
      this.suffix = suffix;
   }

   private class00162 i() {
      if (this.suffix.N() != null) {
         return this.suffix.N();
      } else {
         return switch (this.base) {
            case field_58009, field_58011 -> class00162.field_58018;
            case field_58010 -> class00162.field_58017;
         };
      }
   }

   public class00154 u() {
      return this.suffix;
   }

   public class00182 y() {
      return this.base;
   }

   @Nullable
   public <T> T N(DynamicOps<T> var1, class00157 var2, class02325<?> var3) {
      boolean flag = this.i() == class00162.field_58017;
      if (!flag && this.sign == class00150.field_58015) {
         var3.y().N(var3.M(), class08876.L);
         return null;
      } else {
         String s = this.N(this.sign);

         byte b0 = switch (this.base) {
            case field_58009 -> 2;
            case field_58010 -> 10;
            case field_58011 -> 16;
         };

         try {
            if (flag) {
               return (T)(switch (var2) {
                  case field_58022 -> (Object)var1.createByte(Byte.parseByte(s, b0));
                  case field_58023 -> (Object)var1.createShort(Short.parseShort(s, b0));
                  case field_58024 -> (Object)var1.createInt(Integer.parseInt(s, b0));
                  case field_58025 -> (Object)var1.createLong(Long.parseLong(s, b0));
                  default -> {
                     var3.y().N(var3.M(), class08876.y);
                     yield null;
                  }
               });
            } else {
               return (T)(switch (var2) {
                  case field_58022 -> (Object)var1.createByte(UnsignedBytes.parseUnsignedByte(s, b0));
                  case field_58023 -> (Object)var1.createShort(class08876.N(s, b0));
                  case field_58024 -> (Object)var1.createInt(Integer.parseUnsignedInt(s, b0));
                  case field_58025 -> (Object)var1.createLong(Long.parseUnsignedLong(s, b0));
                  default -> {
                     var3.y().N(var3.M(), class08876.y);
                     yield null;
                  }
               });
            }
         } catch (NumberFormatException numberformatexception) {
            var3.y().N(var3.M(), class08876.N(numberformatexception));
            return null;
         }
      }
   }

   public class00150 N() {
      return this.sign;
   }

   private String N(class00150 var1) {
      boolean flag = class08876.N(this.digits);
      if (var1 != class00150.field_58015 && !flag) {
         return this.digits;
      } else {
         StringBuilder stringbuilder = new StringBuilder();
         var1.N(stringbuilder);
         class08876.N(stringbuilder, this.digits, flag);
         return stringbuilder.toString();
      }
   }

   @Nullable
   public <T> T N(DynamicOps<T> var1, class02325<?> var2) {
      return this.N(var1, Objects.requireNonNullElse(this.suffix.y(), class00157.field_58024), var2);
   }
}
