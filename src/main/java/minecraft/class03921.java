package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class03921 extends class01733 {
   public class03921(Schema var1) {
      super(var1, false, "Remove filtered text from signs", class06962.G, "minecraft:sign");
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4");
   }
}
