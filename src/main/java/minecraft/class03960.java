package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class03960 extends class03952 {
   public class03960(Schema var1) {
      super(var1, "Remove filtered text from books", var0 -> var0.equals("minecraft:writable_book") || var0.equals("minecraft:written_book"));
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return class07536.N(var1, var1.getType(), var0 -> var0.remove("filtered_title").remove("filtered_pages"));
   }
}
