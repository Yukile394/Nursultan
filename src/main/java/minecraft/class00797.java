package minecraft;

import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class class00797 extends class01396<class00799> {
   public class00797() {
      super();
   }

   public void N(class04770 var1, Collection<? extends class07049> var2) {
      List list = var2.stream().map(var1x -> class00821.y(var1, var1x)).collect(Collectors.toList());
      this.N_27(var1, var1x -> var1x.N(list));
   }

   @Override
   public Codec<class00799> N() {
      return class00799.N;
   }
}
