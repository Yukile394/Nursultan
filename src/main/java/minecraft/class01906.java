package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;

public class class01906 {
   private static final Logger N = LogUtils.getLogger();
   private static final byte y = 1;
   private static final byte L = 2;

   public class01906() {
      super();
   }

   public static boolean y(byte var0) {
      return (var0 & 2) != 0;
   }

   private static <T> void N(CommandNode<T> var0, Set<ArgumentType<?>> var1, Set<CommandNode<T>> var2) {
      if (var2.add(var0)) {
         if (var0 instanceof ArgumentCommandNode argumentcommandnode) {
            var1.add(argumentcommandnode.getType());
         }

         var0.getChildren().forEach(var2x -> N(var2x, var1, var2));
         CommandNode commandnode = var0.getRedirect();
         if (commandnode != null) {
            N(commandnode, var1, var2);
         }
      }
   }

   public static <T> Set<ArgumentType<?>> N(CommandNode<T> var0) {
      ReferenceOpenHashSet referenceopenhashset = new ReferenceOpenHashSet();
      HashSet hashset = new HashSet();
      N(var0, hashset, referenceopenhashset);
      return hashset;
   }

   public static <S> JsonObject N(CommandDispatcher<S> var0, CommandNode<S> var1) {
      JsonObject jsonobject = new JsonObject();
      switch (var1) {
         case RootCommandNode rootcommandnode:
            jsonobject.addProperty("type", "root");
            break;
         case LiteralCommandNode var6:
            jsonobject.addProperty("type", "literal");
            break;
         case ArgumentCommandNode argumentcommandnode:
            N(jsonobject, argumentcommandnode.getType());
            break;
         default:
            N.error("Could not serialize node {} ({})!", var1, var1.getClass());
            jsonobject.addProperty("type", "unknown");
      }

      Collection collection = var1.getChildren();
      if (!collection.isEmpty()) {
         JsonObject jsonobject1 = new JsonObject();

         for (CommandNode commandnode : collection) {
            jsonobject1.add(commandnode.getName(), N(var0, commandnode));
         }

         jsonobject.add("children", jsonobject1);
      }

      if (var1.getCommand() != null) {
         jsonobject.addProperty("executable", true);
      }

      if (var1.getRequirement() instanceof class08166 class08166) {
         JsonElement jsonelement = (JsonElement)class08164.N
            .encodeStart(JsonOps.INSTANCE, class08166.N())
            .getOrThrow(var0x -> new IllegalStateException("Failed to serialize requirement: " + var0x));
         jsonobject.add("permissions", jsonelement);
      }

      if (var1.getRedirect() != null) {
         Collection<String> collection1 = var0.getPath(var1.getRedirect());
         if (!collection1.isEmpty()) {
            JsonArray jsonarray = new JsonArray();

            for (String s : collection1) {
               jsonarray.add(s);
            }

            jsonobject.add("redirect", jsonarray);
         }
      }

      return jsonobject;
   }

   public static boolean N(byte var0) {
      return (var0 & 1) != 0;
   }

   private static <A extends ArgumentType<?>, T extends class06763<A>> void N(JsonObject var0, class06799<A, T> var1, class06763<A> var2) {
      var1.N((T)var2, var0);
   }

   private static <T extends ArgumentType<?>> void N(JsonObject var0, T var1) {
      class06763 class06763 = class06789.y(var1);
      var0.addProperty("type", "argument");
      var0.addProperty("parser", String.valueOf(class04206.t.y(class06763.N())));
      JsonObject jsonobject = new JsonObject();
      N(jsonobject, class06763.N(), class06763);
      if (!jsonobject.isEmpty()) {
         var0.add("properties", jsonobject);
      }
   }

   public static int N(boolean var0, boolean var1) {
      byte b0 = 0;
      if (var0) {
         b0 |= 1;
      }

      if (var1) {
         b0 |= 2;
      }

      return b0;
   }
}
