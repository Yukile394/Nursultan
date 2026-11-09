package minecraft;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class03039<S>(List<class03067<S>> arguments) {
   public class03039(List<class03067<S>> arguments) {
      this.arguments = arguments;
   }

   public static <S> class03039<S> y(ParseResults<S> var0) {
      String s = var0.getReader().getString();
      CommandContextBuilder commandcontextbuilder = var0.getContext();
      CommandContextBuilder commandcontextbuilder1 = commandcontextbuilder;
      List list = N(s, commandcontextbuilder);

      CommandContextBuilder commandcontextbuilder2;
      while (
         (commandcontextbuilder2 = commandcontextbuilder1.getChild()) != null && commandcontextbuilder2.getRootNode() != commandcontextbuilder.getRootNode()
      ) {
         list.addAll(N(s, commandcontextbuilder2));
         commandcontextbuilder1 = commandcontextbuilder2;
      }

      return new class03039<>(list);
   }

   public List<class03067<S>> N() {
      return this.arguments;
   }

   @Nullable
   public class03067<S> N(String var1) {
      for (class03067 class03067 : this.arguments) {
         if (var1.equals(class03067.N())) {
            return class03067;
         }
      }

      return null;
   }

   private static <S> List<class03067<S>> N(String var0, CommandContextBuilder<S> var1) {
      ArrayList arraylist = new ArrayList();
      Iterator iterator = var1.getNodes().iterator();

      while (iterator.hasNext()) {
         if (((ParsedCommandNode)iterator.next()).getNode() instanceof ArgumentCommandNode argumentcommandnode
            && argumentcommandnode.getType() instanceof class04458) {
            ParsedArgument parsedargument = (ParsedArgument)var1.getArguments().get(argumentcommandnode.getName());
            if (parsedargument != null) {
               String s = parsedargument.getRange().get(var0);
               arraylist.add(new class03067(argumentcommandnode, s));
            }
         }
      }

      return arraylist;
   }

   public static <S> boolean N(ParseResults<S> var0) {
      return !y(var0).N().isEmpty();
   }
}
