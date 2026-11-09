package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class00796 extends class01396<class00802> {
   public class00796() {
      super();
   }

   public void N(class04770 var1, class07633 var2, class07633 var3, @Nullable class07077 var4) {
      class05908 class05908xx = class00821.y(var1, var2);
      class05908 class05908x = class00821.y(var1, var3);
      class05908 class05908xx = var4 != null ? class00821.y(var1, var4) : null;
      this.N_27(var1, var3x -> var3x.N(class05908xx, class05908x, class05908));
   }

   @Override
   public Codec<class00802> N() {
      return class00802.N;
   }
}
