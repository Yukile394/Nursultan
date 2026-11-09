package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

record class04429(Map<String, String> biomeMapping, String fallback) {

   private class04429(Map<String, String> biomeMapping, String fallback) {
      this.biomeMapping = biomeMapping;
      this.fallback = fallback;
   }

   public String y() {
      return this.fallback;
   }

   public Map<String, String> N() {
      return this.biomeMapping;
   }

   public static class04429 N(String var0) {
      return new class04429(Map.of(), var0);
   }

   public static class04429 N(Map<List<String>, String> var0, String var1) {
      return new class04429(N(var0), var1);
   }

   private static Map<String, String> N(Map<List<String>, String> var0) {
      Builder builder = ImmutableMap.builder();

      for (Entry entry : var0.entrySet()) {
         ((List)entry.getKey()).forEach(var2 -> builder.put(var2, (String)entry.getValue()));
      }

      return builder.build();
   }
}
