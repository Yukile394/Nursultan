package minecraft;

import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class class00993 extends DataFix {
   private static final String y = "generatorOptions";
   static final String N = "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
   private static final Splitter L = Splitter.on(';').limit(5);
   private static final Splitter u = Splitter.on(',');
   private static final Splitter i = Splitter.on('x').limit(2);
   private static final Splitter R = Splitter.on('*').limit(2);
   private static final Splitter M = Splitter.on(':').limit(3);

   public class00993(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.get("generatorName").asString("").equalsIgnoreCase("flat")
         ? var1.update("generatorOptions", var1x -> (Dynamic)DataFixUtils.orElse(var1x.asString().map(this::N).map(var1x::createString).result(), var1x))
         : var1;
   }

   String N(String var1) {
      if (var1.isEmpty()) {
         return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
      } else {
         Iterator iterator = L.split(var1).iterator();
         String s = (String)iterator.next();
         int ix;
         String s1;
         if (iterator.hasNext()) {
            ix = NumberUtils.toInt(s, 0);
            s1 = (String)iterator.next();
         } else {
            ix = 0;
            s1 = s;
         }

         if (ix >= 0 && ix <= 3) {
            StringBuilder stringbuilder = new StringBuilder();
            Splitter splitter = ix < 3 ? i : R;
            stringbuilder.append(StreamSupport.<String>stream(u.split(s1).spliterator(), false).map(var2x -> {
               List list = splitter.splitToList(var2x);
               int ixx;
               String sx;
               if (list.size() == 2) {
                  ixx = NumberUtils.toInt((String)list.get(0));
                  sx = (String)list.get(1);
               } else {
                  ixx = 1;
                  sx = (String)list.get(0);
               }

               List list1 = M.splitToList(sx);
               int j = ((String)list1.get(0)).equals("minecraft") ? 1 : 0;
               String s1x = (String)list1.get(j);
               int k = ix == 3 ? class05794.N("minecraft:" + s1x) : NumberUtils.toInt(s1x, 0);
               int l = j + 1;
               int i1 = list1.size() > l ? NumberUtils.toInt((String)list1.get(l), 0) : 0;
               return (ixx == 1 ? "" : ixx + "*") + class05803.y(k << 4 | i1).get("Name").asString("");
            }).collect(Collectors.joining(",")));

            while (iterator.hasNext()) {
               stringbuilder.append(';').append((String)iterator.next());
            }

            return stringbuilder.toString();
         } else {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
         }
      }
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelFlatGeneratorInfoFix", this.getInputSchema().getType(class06962.N), var1 -> var1.update(DSL.remainderFinder(), this::N)
      );
   }
}
