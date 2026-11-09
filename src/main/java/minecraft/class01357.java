package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class class01357 extends class01350 {
   private static final Logger y = LogUtils.getLogger();

   public class01357(Schema var1) {
      super(var1, class06962.W);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "SavedDataUUIDFix",
         this.getInputSchema().getType(this.N),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.update(
               "data",
               var0xx -> var0xx.update(
                  "Raids",
                  var0xxx -> var0xxx.createList(
                     var0xxx.asStream()
                        .map(
                           var0xxxx -> var0xxxx.update(
                              "HeroesOfTheVillage",
                              var0xxxxx -> var0xxxxx.createList(
                                 var0xxxxx.asStream().map(var0xxxxxx -> (Dynamic)u((Dynamic<?>)var0xxxxxx, "UUIDMost", "UUIDLeast").orElseGet(() -> {
                                    y.warn("HeroesOfTheVillage contained invalid UUIDs.");
                                    return (Dynamic<?>)var0xxxxxx;
                                 }))
                              )
                           )
                        )
                  )
               )
            )
         )
      );
   }
}
