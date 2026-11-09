package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

final class class05662 extends class05677 {
   class05662(String var1, int var2, String var3) {
      super(var3);
   }

   @Override
   public void N(class07709 var1, class07793 var2, List<class07709> var3) throws CommandSyntaxException {
      var2.N(var1, class07001::new).forEach(var1x -> {
         if (var1x instanceof class07001) {
            var3.forEach(var1xx -> {
               if (var1xx instanceof class07001) {
                  ((class07001)var1x).N((class07001)var1xx);
               }
            });
         }
      });
   }
}
