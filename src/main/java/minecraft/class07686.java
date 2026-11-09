package minecraft;

import Nursultan.class10206;
import Nursultan.class10560;
import Nursultan.class10564;
import Nursultan.class10567;
import Nursultan.class10783;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.loader.api.FabricLoader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07686 {
   public static final String N = "/";
   private static final ThreadLocal<class01752<class07701>> M = new ThreadLocal<>();
   private static final Logger B = LogUtils.getLogger();
   public static final class08164 y = class08160.y;
   public static final class08164 L = new class08149(class08162.N);
   public static final class08164 u = new class08149(class08162.y);
   public static final class08164 i = new class08149(class08162.L);
   public static final class08164 R = new class08149(class08162.u);
   private static final class07273<class07701> Z = new class07704();
   private final CommandDispatcher<class07701> z = new CommandDispatcher();

   public class07686(class07671 var1, class04348 var2) {
      super();
      class06405.N(this.z);
      class05195.N(this.z, var2);
      class01577.N(this.z, var2);
      class06426.N(this.z, var2);
      class06424.N(this.z, var2);
      class06416.N(this.z, var2);
      class03671.N(this.z, var2);
      class05616.N(this.z);
      class06395.N(this.z, var2);
      class06401.N(this.z);
      class06406.N(this.z);
      class09012.N(this.z, var2);
      class06420.N(this.z);
      class06412.N(this.z, var2);
      class01547.N(this.z);
      class01545.N(this.z, var2);
      class01558.N(this.z);
      class01553.N(this.z, var2);
      class04207.N(this.z, var2);
      class01560.N(this.z);
      class01568.N(this.z);
      class01557.N(this.z);
      class01549.N(this.z, var2);
      class01542.N(this.z, var2);
      class01543.N(this.z);
      class06352.N(this.z, var2);
      class01544.N(this.z);
      class01563.N(this.z);
      class01561.N(this.z);
      class01556.N(this.z, var2);
      class06381.N(this.z, var2);
      class01564.N(this.z);
      class01575.N(this.z, var2);
      class03186.N(this.z);
      class06195.N(this.z);
      class04180.N(this.z);
      class06200.N(this.z);
      class06215.N(this.z);
      class00940.N(this.z);
      class10206.N(this.z);
      class02094.N(this.z);
      class00249.N(this.z);
      class06210.N(this.z);
      class06217.N(this.z);
      class06206.N(this.z, var2);
      class06213.N(this.z, var1 != class07671.field_25421);
      class00017.N(this.z, var1 != class07671.field_25421);
      class06192.N(this.z, var2);
      class06205.N(this.z);
      class06208.N(this.z);
      class05931.N(this.z);
      class06190.N(this.z);
      class06226.N(this.z);
      class06956.N(this.z);
      class06214.N(this.z, var2);
      class05597.N(this.z);
      class05595.N(this.z, var2);
      class05843.N(this.z);
      class05625.N(this.z);
      class05588.N(this.z, var2);
      class05512.N(this.z, var2);
      class03131.N(this.z);
      class05609.N(this.z);
      class05626.N(this.z, var2);
      class05624.N(this.z);
      class00024.N(this.z, var2);
      class05620.N(this.z);
      class05627.N(this.z);
      if (class01834.M.i()) {
         class01808.N(this.z);
      }

      if (class07529.Nm) {
         class03305.N(this.z);
      }

      if (class07529.Ns || class07529.ND) {
         class01685.N(this.z, var2);
         class01703.N(this.z);
         class01701.N(this.z);
         class04014.N(this.z);
         class03282.N(this.z);
         class01760.N(this.z);
         if (var1.field_25423) {
            class04163.N(this.z, var2);
         }
      }

      if (var1.field_25423) {
         CommandDispatcher commanddispatcher1 = this.z;
         this.y(var1, var2, null);
         class06423.N(commanddispatcher1);
         class06399.N(this.z);
         class06407.N(this.z);
         class06421.N(this.z);
         class01537.N(this.z);
         class01538.N(this.z);
         class01566.N(this.z);
         class04556.N(this.z);
         class10564.N(this.z);
         class10567.N(this.z);
         class10560.N(this.z);
         class06211.N(this.z);
         class06188.N(this.z);
         class02891.N(this.z);
         class05613.N(this.z);
      }

      if (var1.field_25422) {
         class06223.N(this.z);
      }

      CommandDispatcher commanddispatcher = this.z;
      ResultConsumer resultconsumer = class01711.k();
      this.N(var1, var2, null);
      commanddispatcher.setConsumer(resultconsumer);
   }

   private void y(class07671 var1, class04348 var2, CallbackInfo var3) {
      if (!class07529.ND) {
         if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            class04163.N(this.z, var2);
         }
      }
   }

   @Nullable
   public static <S> CommandSyntaxException y(ParseResults<S> var0) {
      if (!var0.getReader().canRead()) {
         return null;
      } else if (var0.getExceptions().size() == 1) {
         return (CommandSyntaxException)var0.getExceptions().values().iterator().next();
      } else {
         return var0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(var0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(var0.getReader());
      }
   }

   public static LiteralArgumentBuilder<class07701> y(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   public static void y() {
      class04348 class04348 = N(class04105.N());
      CommandDispatcher<class07701> commanddispatcher = new class07686(class07671.field_25419, class04348).N();
      RootCommandNode<class07701> rootcommandnode = commanddispatcher.getRoot();
      commanddispatcher.findAmbiguities(
         (var1x, var2x, var3, var4x) -> B.warn(
            "Ambiguity between arguments {} and {} with inputs: {}", new Object[]{commanddispatcher.getPath(var2x), commanddispatcher.getPath(var3), var4x}
         )
      );
      Set set = class01906.N(rootcommandnode).stream().filter(var0x -> !class06789.N(var0x.getClass())).collect(Collectors.toSet());
      if (!set.isEmpty()) {
         B.warn("Missing type registration for following arguments:\n {}", set.stream().map(var0x -> "\t" + var0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }

   public static String N(String var0) {
      return var0.startsWith("/") ? var0.substring(1) : var0;
   }

   public void N(ParseResults<class07701> var1, String var2) {
      class07701 class07701 = (class07701)var1.getContext().getSource();
      class08700.N().N(() -> "/" + var2);
      ContextChain<class07701> contextchain = N(var1, var2, class07701);

      try {
         if (contextchain != null) {
            N(class07701, var3x -> class01752.N(var3x, var2, contextchain, class07701, class03102.N));
         }
      } catch (Exception exception) {
         class05216 class05216 = class00392.y(exception.getMessage() == null ? exception.getClass().getName() : exception.getMessage());
         if (B.isDebugEnabled()) {
            B.error("Command exception: /{}", var2, exception);
            StackTraceElement[] astacktraceelement = exception.getStackTrace();

            for (int ix = 0; ix < Math.min(astacktraceelement.length, 3); ix++) {
               class05216.i("\n\n")
                  .i(astacktraceelement[ix].getMethodName())
                  .i("\n ")
                  .i(astacktraceelement[ix].getFileName())
                  .i(":")
                  .i(String.valueOf(astacktraceelement[ix].getLineNumber()));
            }
         }

         class07701.y(class00392.L("command.failed").N(var1x -> var1x.N(new class00401(class05216))));
         if (class07529.NP || class07529.ND) {
            class07701.y(class00392.y(class07536.L(exception)));
            B.error("'/{}' threw an exception", var2, exception);
         }
      } finally {
         class08700.N().L();
      }
   }

   public static class04348 N(class01929 var0) {
      return new class10783(var0);
   }

   private void N(class07671 var1, class04348 var2, CallbackInfo var3) {
      ((CommandRegistrationCallback)CommandRegistrationCallback.EVENT.invoker()).register(this.z, var2, var1);
   }

   public static <S> ParseResults<S> N(ParseResults<S> var0, UnaryOperator<S> var1) {
      CommandContextBuilder commandcontextbuilder = var0.getContext();
      CommandContextBuilder commandcontextbuilder1 = commandcontextbuilder.withSource(var1.apply(commandcontextbuilder.getSource()));
      return new ParseResults(commandcontextbuilder1, var0.getReader(), var0.getExceptions());
   }

   public void N(class07701 var1, String var2) {
      var2 = N(var2);
      this.N(this.z.parse(var2, var1), var2);
   }

   public void N(class04770 var1) {
      HashMap hashmap = new HashMap();
      RootCommandNode rootcommandnode = new RootCommandNode();
      hashmap.put(this.z.getRoot(), rootcommandnode);
      N(this.z.getRoot(), rootcommandnode, var1.method_64396(), hashmap);
      var1.field_13987.method_14364(new class07233(rootcommandnode, Z));
   }

   public static <S> void N(ParseResults<S> var0) throws CommandSyntaxException {
      CommandSyntaxException commandsyntaxexception = y(var0);
      if (commandsyntaxexception != null) {
         throw commandsyntaxexception;
      }
   }

   public CommandDispatcher<class07701> N() {
      return this.z;
   }

   public static Predicate<String> N_80(class07673 var0) {
      return var1 -> {
         try {
            var0.parse(new StringReader(var1));
            return true;
         } catch (CommandSyntaxException commandsyntaxexception) {
            return false;
         }
      };
   }

   public static <T> RequiredArgumentBuilder<class07701, T> N(String var0, ArgumentType<T> var1) {
      return RequiredArgumentBuilder.argument(var0, var1);
   }

   private static <S> void N(CommandNode<S> var0, CommandNode<S> var1, S var2, Map<CommandNode<S>, CommandNode<S>> var3) {
      for (CommandNode commandnode : var0.getChildren()) {
         if (commandnode.canUse(var2)) {
            ArgumentBuilder argumentbuilder = commandnode.createBuilder();
            if (argumentbuilder.getRedirect() != null) {
               argumentbuilder.redirect((CommandNode)var3.get(argumentbuilder.getRedirect()));
            }

            CommandNode commandnode1 = argumentbuilder.build();
            var3.put(commandnode, commandnode1);
            var1.addChild(commandnode1);
            if (!commandnode.getChildren().isEmpty()) {
               N(commandnode, commandnode1, var2, var3);
            }
         }
      }
   }

   public static class07701 N(class08152 var0) {
      return new class07701(class07703.j_, class06889.L, class07109.N, null, var0, "", class05220.N, null, null);
   }

   public static <T extends class08168> class08166<T> N(class08164 var0) {
      return new class08166<>(var0);
   }

   @Nullable
   private static ContextChain<class07701> N(ParseResults<class07701> var0, String var1, class07701 var2) {
      try {
         N(var0);
         return (ContextChain<class07701>)ContextChain.tryFlatten(var0.getContext().build(var1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(var0.getReader()));
      } catch (CommandSyntaxException commandsyntaxexception) {
         var2.y(class00390.N(commandsyntaxexception.getRawMessage()));
         if (commandsyntaxexception.getInput() != null && commandsyntaxexception.getCursor() >= 0) {
            int ix = Math.min(commandsyntaxexception.getInput().length(), commandsyntaxexception.getCursor());
            class05216 class05216x = class00392.i().N(class06541.field_1080).N(var1x -> var1x.N(new class00640("/" + var1)));
            if (ix > 10) {
               class05216x.y(class05220.G);
            }

            class05216x.i(commandsyntaxexception.getInput().substring(Math.max(0, ix - 10), ix));
            if (ix < commandsyntaxexception.getInput().length()) {
               class05216 class05216x = class00392.y(commandsyntaxexception.getInput().substring(ix)).N(class06541.field_1061, class06541.field_1073);
               class05216x.y(class05216x);
            }

            class05216x.y(class00392.L("command.context.here").N(class06541.field_1061, class06541.field_1056));
            var2.y(class05216x);
         }

         return null;
      }
   }

   public static void N(class07701 var0, Consumer<class01752<class07701>> var1) {
      class01752<class07701> class01752 = M.get();
      if (class01752 == null) {
         class07305 class07305 = var0.R().method_64395();
         int ix = Math.max(1, class07305.N(class07305.w));
         int j = class07305.N(class07305.d);

         try (class01752 class01752x = new class01752(ix, j, class08700.N())) {
            M.set(class01752x);
            var1.accept(class01752x);
            class01752x.N();
         } finally {
            M.set(null);
         }
      } else {
         var1.accept(class01752);
      }
   }
}
