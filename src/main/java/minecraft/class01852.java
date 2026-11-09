package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public record class01852(class01880 type, class05097 exception) {
   public class01852(class01880 type, @Nullable class05097 exception) {
      super();
      this.type = type;
      this.exception = exception;
   }

   public class01852(class05097 var1) {
      this(class01880.field_45189, var1);
   }

   public class01852(class01880 var1) {
      this(var1, null);
   }

   @Nullable
   public class05097 y() {
      return this.exception;
   }

   @Nullable
   public class05096 N(class05096 var1) {
      return (class05096)(switch (this.type) {
         case field_45185 -> null;
         case field_45186 -> new class05138(var1);
         case field_45187 -> new class04713(var1);
         case field_45188 -> new class04702(class00392.L("mco.error.invalid.session.title"), class00392.L("mco.error.invalid.session.message"), var1);
         case field_45189 -> new class04702(Objects.requireNonNull(this.exception), var1);
      });
   }

   public class01880 N() {
      return this.type;
   }
}
