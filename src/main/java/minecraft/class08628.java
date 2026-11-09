package minecraft;

import java.util.Optional;

public record class08628(class07209 pos, class08616 action, class08595 data) implements class00381<class08051> {
   public static final class02362<class04247, class08628> N = class02362.N(
      class07209.field_48404, class08628::N, class08616.field_55927, class08628::y, class08595.y, class08628::L, class08628::new
   );

   public class08595 L() {
      return this.data;
   }

   public class08628(class07209 var1, class08616 var2, Optional<class05946<class00201>> var3, class00753 var4, class06993 var5, boolean var6) {
      this(var1, var2, new class08595(var3, var4, var5, var6, class08625.field_56014, Optional.empty()));
   }

   public class08628(class07209 pos, class08616 action, class08595 data) {
      this.pos = pos;
      this.action = action;
      this.data = data;
   }

   public class08616 y() {
      return this.action;
   }

   public void method_65081(class08051 var1) {
      var1.method_66582(this);
   }

   public class07209 N() {
      return this.pos;
   }

   @Override
   public class02897<class08628> method_65080() {
      return class04248.LT;
   }
}
