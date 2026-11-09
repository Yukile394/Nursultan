package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;

public class class04554 extends class01396<class04545> {
   public class04554() {
      super();
   }

   public void N(class04770 var1, class00672 var2, List<class07049> var3) {
      List list = var3.stream().map(var1x -> class00821.y(var1, var1x)).collect(Collectors.toList());
      class05908 class05908 = class00821.y(var1, var2);
      this.N_27(var1, var2x -> var2x.N(class05908, list));
   }

   @Override
   public Codec<class04545> N() {
      return class04545.N;
   }
}
