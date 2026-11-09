package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

final class class05642 extends class05677 {
   class05642(String var1, int var2, String var3) {
      super(var3);
   }

   @Override
   public void N(class07709 var1, class07793 var2, List<class07709> var3) throws CommandSyntaxException {
      var2.N(var1, (class07709)Iterables.getLast(var3));
   }
}
