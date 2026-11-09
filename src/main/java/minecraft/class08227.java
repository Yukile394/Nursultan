package minecraft;

import Nursultan.class10881;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public record class08227(Map<String, String> values, Set<String> flags) {
   public static final class08227 N = new class08227(Map.of(), Set.of());
   public static final Codec<class08227> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.unboundedMap(Codec.STRING, Codec.STRING).optionalFieldOf("values", Map.of()).forGetter(class08227::u),
            Codec.STRING.listOf().xmap(Set::copyOf, List::copyOf).optionalFieldOf("flags", Set.of()).forGetter(class08227::i)
         )
         .apply(var0, class08227::new)
   );

   public boolean L() {
      return this.values.isEmpty() && this.flags.isEmpty();
   }

   public class08227(Map<String, String> values, Set<String> flags) {
      this.values = values;
      this.flags = flags;
   }

   public Set<String> i() {
      return this.flags;
   }

   public Map<String, String> u() {
      return this.values;
   }

   public String y() {
      StringBuilder stringbuilder = new StringBuilder();

      for (Entry entry : this.values.entrySet()) {
         String s = (String)entry.getKey();
         String s1 = (String)entry.getValue();
         stringbuilder.append("#define ").append(s).append(" ").append(s1).append('\n');
      }

      for (String s2 : this.flags) {
         stringbuilder.append("#define ").append(s2).append('\n');
      }

      return stringbuilder.toString();
   }

   public class08227 N(class08227 var1) {
      if (this.L()) {
         return var1;
      } else if (var1.L()) {
         return this;
      } else {
         Builder builder = ImmutableMap.builderWithExpectedSize(this.values.size() + var1.values.size());
         builder.putAll(this.values);
         builder.putAll(var1.values);
         com.google.common.collect.ImmutableSet.Builder builder1 = ImmutableSet.builderWithExpectedSize(this.flags.size() + var1.flags.size());
         builder1.addAll(this.flags);
         builder1.addAll(var1.flags);
         return new class08227(builder.buildKeepingLast(), builder1.build());
      }
   }

   public static class10881 N() {
      return new class10881();
   }
}
