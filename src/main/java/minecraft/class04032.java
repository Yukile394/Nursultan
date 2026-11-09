package minecraft;

import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record class04032(class04038 confidence, String description) {
   public class04038 L() {
      return this.confidence;
   }

   public class04032(class04038 confidence, String description) {
      super();
      this.confidence = confidence;
      this.description = description;
   }

   public String u() {
      return this.description;
   }

   public String y() {
      return this.confidence.field_35177 + " " + this.description;
   }

   public class04032 N(class04032 var1) {
      return new class04032((class04038)ObjectUtils.max(new class04038[]{this.confidence, var1.confidence}), this.description + "; " + var1.description);
   }

   public static class04032 N(String var0, Supplier<String> var1, String var2, Class<?> var3) {
      String s = (String)var1.get();
      if (!var0.equals(s)) {
         return new class04032(class04038.field_35176, var2 + " brand changed to '" + s + "'");
      } else {
         return var3.getSigners() == null
            ? new class04032(class04038.field_35175, var2 + " jar signature invalidated")
            : new class04032(class04038.field_35174, var2 + " jar signature and brand is untouched");
      }
   }

   public boolean N() {
      return this.confidence.field_35178;
   }
}
