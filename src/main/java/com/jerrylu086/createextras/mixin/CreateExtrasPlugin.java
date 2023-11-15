package com.jerrylu086.createextras.mixin;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class CreateExtrasPlugin implements IMixinConfigPlugin {
    private static final String COMPAT_PACK = "com.jerrylu086.createextras.mixin.compat.";

    @Override
    public void onLoad(String mixinPackage) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        if (mixinClassName.startsWith(COMPAT_PACK + "another_furniture")
                && !FabricLoader.getInstance().isModLoaded("another_furniture"))
            return false;

        if (mixinClassName.startsWith(COMPAT_PACK + "mantle")
                && !FabricLoader.getInstance().isModLoaded("mantle"))
            return false;

        if (mixinClassName.startsWith(COMPAT_PACK + "tconstruct")
                && !FabricLoader.getInstance().isModLoaded("tconstruct"))
            return false;

        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

}
