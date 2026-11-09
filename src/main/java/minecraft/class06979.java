package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Optional;

public class class06979 extends DataFix {
   public class06979(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsLowerCaseLanguageFix", this.getInputSchema().getType(class06962.R), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            Optional optional = var0x.get("lang").asString().result();
            return optional.isPresent() ? var0x.set("lang", var0x.createString(((String)optional.get()).toLowerCase(Locale.ROOT))) : var0x;
         })
      );
   }
}
