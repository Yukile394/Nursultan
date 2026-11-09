package minecraft;

import org.jspecify.annotations.Nullable;

record class03029(class04018 condition, class03003 followup) implements class03003 {
   class03029(class04018 condition, class03003 followup) {
      this.condition = condition;
      this.followup = followup;
   }

   public class03003 y() {
      return this.followup;
   }

   public class04018 N() {
      return this.condition;
   }

   @Nullable
   @Override
   public class00500 tryApply(int var1, int var2, int var3) {
      return !this.condition.y() ? null : this.followup.tryApply(var1, var2, var3);
   }
}
