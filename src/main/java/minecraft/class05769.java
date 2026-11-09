package minecraft;

import java.util.stream.Stream;

public enum class05769 {
   field_18855("RUN_ONE", 0) {
      @Override
      public <E extends class07438> void N(Stream<class04142<? super E>> var1, class04782 var2, E var3, long var4) {
         var1.filter(var0 -> var0.method_18921() == class05748.field_18337).filter(var4x -> var4x.method_18922(var2, var3, var4)).findFirst();
      }

      public void lithium$apply(class02150 var1, class04782 var2, class07438 var3, long var4) {
         for (class04142 class04142 : var1) {
            if (class04142.method_18921() == class05748.field_18337 && class04142.method_18922(var2, var3, var4)) {
               return;
            }
         }
      }
   },
   field_18856("TRY_ALL", 1) {
      @Override
      public <E extends class07438> void N(Stream<class04142<? super E>> var1, class04782 var2, E var3, long var4) {
         var1.filter(var0 -> var0.method_18921() == class05748.field_18337).forEach(var4x -> var4x.method_18922(var2, var3, var4));
      }

      public void lithium$apply(class02150 var1, class04782 var2, class07438 var3, long var4) {
         for (class04142 class04142 : var1) {
            if (class04142.method_18921() == class05748.field_18337) {
               class04142.method_18922(var2, var3, var4);
            }
         }
      }
   };

   class05769() {
   }

   public abstract <E extends class07438> void N(Stream<class04142<? super E>> var1, class04782 var2, E var3, long var4);
}
