package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

record class02036(
   class02038 owner,
   class04114 lookup,
   Map<class01894, class02055<?>> registries,
   Map<class05946<?>, class02082<?>> registeredValues,
   List<RuntimeException> errors
) {

   public void L() {
      for (class05946<Object> class05946 : this.lookup.N.keySet()) {
         this.errors.add(new IllegalStateException("Unreferenced key: " + class05946));
      }
   }

   public Map<class01894, class02055<?>> M() {
      return this.registries;
   }

   private class02036(
      class02038 owner,
      class04114 lookup,
      Map<class01894, class02055<?>> registries,
      Map<class05946<?>, class02082<?>> registeredValues,
      List<RuntimeException> errors
   ) {
      super();
      this.owner = owner;
      this.lookup = lookup;
      this.registries = registries;
      this.registeredValues = registeredValues;
      this.errors = errors;
   }

   public Map<class05946<?>, class02082<?>> B() {
      return this.registeredValues;
   }

   public List<RuntimeException> Z() {
      return this.errors;
   }

   public class02038 i() {
      return this.owner;
   }

   public void u() {
      if (!this.errors.isEmpty()) {
         IllegalStateException illegalstateexception = new IllegalStateException("Errors during registry creation");

         for (RuntimeException runtimeexception : this.errors) {
            illegalstateexception.addSuppressed(runtimeexception);
         }

         throw illegalstateexception;
      }
   }

   public void y() {
      this.registeredValues.forEach((var1, var2) -> this.errors.add(new IllegalStateException("Orpaned value " + var2.N() + " for key " + var1)));
   }

   public <T> class04116<T> N() {
      return new class02064<>(this);
   }

   public static class02036 N(class01042 var0, Stream<class05946<? extends class00751<?>>> var1) {
      class02038 class02038 = new class02038();
      ArrayList arraylist = new ArrayList();
      class04114 class04114 = new class04114(class02038);
      Builder builder = ImmutableMap.builder();
      var0.method_40311().forEach(var1x -> builder.put(var1x.N().N(), class02061.N(var1x.y())));
      var1.forEach(var2x -> builder.put(var2x.N(), class04114));
      return new class02036(class02038, class04114, builder.build(), new HashMap<>(), arraylist);
   }

   public class04114 R() {
      return this.lookup;
   }
}
