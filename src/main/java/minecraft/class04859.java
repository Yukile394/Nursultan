package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

record class04859(class01894 fontId, List<class04870> builders, Set<class01894> dependencies) implements class03511<class01894> {

   public Set<class01894> L() {
      return this.dependencies;
   }

   public class04859(class01894 var1) {
      this(var1, new ArrayList<>(), new HashSet<>());
   }

   private class04859(class01894 fontId, List<class04870> builders, Set<class01894> dependencies) {
      super();
      this.fontId = fontId;
      this.builders = builders;
      this.dependencies = dependencies;
   }

   public Stream<CompletableFuture<Optional<class06262>>> u() {
      return this.builders.stream().flatMap(var0 -> var0.L().left().stream());
   }

   public List<class04870> y() {
      return this.builders;
   }

   @Override
   public void y(Consumer<class01894> var1) {
   }

   public void N(class04841 var1, class02263 var2, CompletableFuture<Optional<class06262>> var3) {
      this.builders.add(new class04870(var1, var2, Either.left(var3)));
   }

   public void N(class04841 var1, class02263 var2, class06254 var3) {
      this.builders.add(new class04870(var1, var2, Either.right(var3.N())));
      this.dependencies.add(var3.N());
   }

   public class01894 N() {
      return this.fontId;
   }

   public Optional<List<class06251>> N(Function<class01894, List<class06251>> var1) {
      ArrayList arraylist = new ArrayList();
      Iterator<class04870> iterator = this.builders.iterator();

      while (iterator.hasNext()) {
         Optional<List<class06251>> optional = iterator.next().N(var1);
         if (!optional.isPresent()) {
            return Optional.empty();
         }

         arraylist.addAll(optional.get());
      }

      return Optional.of(arraylist);
   }

   @Override
   public void N(Consumer<class01894> var1) {
      this.dependencies.forEach(var1);
   }
}
