package minecraft;

import java.util.function.Function;

public class class06863 {
   private final Function<class03762, class06521<?>> N;

   public class06863(Function<class03762, class06521<?>> var1) {
      super();
      this.N = var1;
   }

   private class05946 N(class05946 var1, class03719 var2) {
      return class05946.N(var1.L(), var2.getRecipeIdentifier(var1.N()));
   }

   public void N(class03719 var1, class05946<class06521<?>> var2) {
      var2 = this.N(var2, var1);
      var1.method_53819(var2, this.N.apply(class03762.field_40251), null);
   }

   public void N(class03719 var1, String var2) {
      this.N(var1, class05946.N(class04227.yV, class01894.N(var2)));
   }

   public static class06863 N(Function<class03762, class06521<?>> var0) {
      return new class06863(var0);
   }
}
