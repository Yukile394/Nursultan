package minecraft;

import org.jspecify.annotations.Nullable;

public record class01823(class01828[] materialRuleList) implements class01828 {
   public class01823(class01828[] materialRuleList) {
      super();
      this.materialRuleList = materialRuleList;
   }

   public class01828[] N() {
      return this.materialRuleList;
   }

   @Nullable
   @Override
   public class00500 calculate(class03875 var1) {
      class01828[] aclass01828 = this.materialRuleList;
      int i = aclass01828.length;

      for (int j = 0; j < i; j++) {
         class00500 class00500 = aclass01828[j].calculate(var1);
         if (class00500 != null) {
            return class00500;
         }
      }

      return null;
   }
}
