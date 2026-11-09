package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02951 extends DataFix {
   private static final Logger N = LogUtils.getLogger();

   private static <T> Map<Dynamic<T>, Dynamic<T>> L(Dynamic<T> var0, String var1) {
      try {
         HashMap hashmap = new HashMap();
         StringReader stringreader = new StringReader(var1);
         stringreader.expect('[');
         stringreader.skipWhitespace();

         while (stringreader.canRead() && stringreader.peek() != ']') {
            stringreader.skipWhitespace();
            String s = stringreader.readString();
            stringreader.skipWhitespace();
            stringreader.expect('=');
            stringreader.skipWhitespace();
            String s1 = stringreader.readString();
            stringreader.skipWhitespace();
            hashmap.put(var0.createString(s), var0.createString(s1));
            if (stringreader.canRead()) {
               if (stringreader.peek() != ',') {
                  break;
               }

               stringreader.skip();
            }
         }

         stringreader.expect(']');
         return hashmap;
      } catch (Exception exception) {
         N.warn("Failed to parse block properties: {}", var1, exception);
         return Map.of();
      }
   }

   private <T> Dynamic<T> M(Dynamic<T> var1, String var2) {
      try {
         StringReader stringreader = new StringReader(var2);
         float f = (float)stringreader.readDouble();
         stringreader.expect(' ');
         float f1 = (float)stringreader.readDouble();
         stringreader.expect(' ');
         float f2 = (float)stringreader.readDouble();
         stringreader.expect(' ');
         int i = stringreader.readInt();
         Dynamic<?> dynamic = var1.createIntList(IntStream.of(class04995.y(f), class04995.y(f1), class04995.y(f2)));
         Dynamic dynamic1 = var1.createMap(Map.of(var1.createString("type"), var1.createString("minecraft:block"), var1.createString("pos"), dynamic));
         return var1.set("destination", dynamic1).set("arrival_in_ticks", var1.createInt(i));
      } catch (Exception exception) {
         N.warn("Failed to parse particle options: {}", var2, exception);
         return var1;
      }
   }

   public class02951(Schema var1) {
      super(var1, true);
   }

   private <T> Dynamic<T> B(Dynamic<T> var1, String var2) {
      try {
         StringReader stringreader = new StringReader(var2);
         int i = stringreader.readInt();
         return var1.set("delay", var1.createInt(i));
      } catch (Exception exception) {
         N.warn("Failed to parse particle options: {}", var2, exception);
         return var1;
      }
   }

   private <T> Dynamic<T> i(Dynamic<T> var1, String var2) {
      try {
         StringReader stringreader = new StringReader(var2);
         Dynamic dynamic = N(var1, stringreader);
         stringreader.expect(' ');
         float f = stringreader.readFloat();
         stringreader.expect(' ');
         Dynamic dynamic1 = N(var1, stringreader);
         return var1.set("from_color", dynamic).set("to_color", dynamic1).set("scale", var1.createFloat(f));
      } catch (Exception exception) {
         N.warn("Failed to parse particle options: {}", var2, exception);
         return var1;
      }
   }

   private <T> Dynamic<T> u(Dynamic<T> var1, String var2) {
      try {
         StringReader stringreader = new StringReader(var2);
         Dynamic dynamic = N(var1, stringreader);
         stringreader.expect(' ');
         float f = stringreader.readFloat();
         return var1.set("color", dynamic).set("scale", var1.createFloat(f));
      } catch (Exception exception) {
         N.warn("Failed to parse particle options: {}", var2, exception);
         return var1;
      }
   }

   private <T> Dynamic<T> y(Dynamic<T> var1, String var2) {
      int i = var2.indexOf("[");
      Dynamic dynamic = var1.emptyMap();
      if (i == -1) {
         dynamic = dynamic.set("Name", var1.createString(class00622.N(var2)));
      } else {
         dynamic = dynamic.set("Name", var1.createString(class00622.N(var2.substring(0, i))));
         Map map = L(var1, var2.substring(i));
         if (!map.isEmpty()) {
            dynamic = dynamic.set("Properties", var1.createMap(map));
         }
      }

      return var1.set("block_state", dynamic);
   }

   @Nullable
   private static <T> Dynamic<T> N(DynamicOps<T> var0, String var1) {
      try {
         return new Dynamic(var0, class07755.N(var0).y(var1));
      } catch (Exception exception) {
         N.warn("Failed to parse tag: {}", var1, exception);
         return null;
      }
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, StringReader var1) throws CommandSyntaxException {
      float f = var1.readFloat();
      var1.expect(' ');
      float f1 = var1.readFloat();
      var1.expect(' ');
      float f2 = var1.readFloat();
      return var0.createList(Stream.of(f, f1, f2).map(var0::createFloat));
   }

   private <T> Dynamic<T> N(Dynamic<T> var1, String var2) {
      int i = var2.indexOf("{");
      Dynamic dynamic = var1.createMap(Map.of(var1.createString("Count"), var1.createInt(1)));
      if (i == -1) {
         dynamic = dynamic.set("id", var1.createString(var2));
      } else {
         dynamic = dynamic.set("id", var1.createString(var2.substring(0, i)));
         Dynamic dynamic1 = N(var1.getOps(), var2.substring(i));
         if (dynamic1 != null) {
            dynamic = dynamic.set("tag", dynamic1);
         }
      }

      return var1.set("item", dynamic);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional<String> optional = var1.asString().result();
      if (optional.isEmpty()) {
         return var1;
      } else {
         String[] astring = optional.get().split(" ", 2);
         String s = class00622.N(astring[0]);
         Dynamic dynamic = var1.createMap(Map.of(var1.createString("type"), var1.createString(s)));

         return switch (s) {
            case "minecraft:item" -> astring.length > 1 ? this.N(dynamic, astring[1]) : dynamic;
            case "minecraft:block", "minecraft:block_marker", "minecraft:falling_dust", "minecraft:dust_pillar" -> astring.length > 1
               ? this.y(dynamic, astring[1])
               : dynamic;
            case "minecraft:dust" -> astring.length > 1 ? this.u(dynamic, astring[1]) : dynamic;
            case "minecraft:dust_color_transition" -> astring.length > 1 ? this.i(dynamic, astring[1]) : dynamic;
            case "minecraft:sculk_charge" -> astring.length > 1 ? this.R(dynamic, astring[1]) : dynamic;
            case "minecraft:vibration" -> astring.length > 1 ? this.M(dynamic, astring[1]) : dynamic;
            case "minecraft:shriek" -> astring.length > 1 ? this.B(dynamic, astring[1]) : dynamic;
            default -> dynamic;
         };
      }
   }

   private <T> Dynamic<T> R(Dynamic<T> var1, String var2) {
      try {
         StringReader stringreader = new StringReader(var2);
         float f = stringreader.readFloat();
         return var1.set("roll", var1.createFloat(f));
      } catch (Exception exception) {
         N.warn("Failed to parse particle options: {}", var2, exception);
         return var1;
      }
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.Q);
      Type<?> type1 = this.getOutputSchema().getType(class06962.Q);
      return this.writeFixAndRead("ParticleUnflatteningFix", type, type1, this::N);
   }
}
