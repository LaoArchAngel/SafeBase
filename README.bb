An easy-to-craft, almost transparent force field to protect your base!  Number per tribe configurable!

[h1]What It Does[/h1]
Adds a new engram for a modified Tek Shield that is immune to damage, does not require tek engrams, and does not burn fuel.  This is perfect for PvP servers that want to allow tribes to have a small base that is completely protected.

[h1]Features[/h1]
[list]
[*] Clean and completely stackable.
[*] Shield max size is configurable.  Default max size is the same as a tek shield.
[*] Configurable limit on number of shields per tribe.  Default is one.
[*] Shield opacity is VERY low.  This means it won't look horrible in dark places, like the Aberration map.
[*] The shield ignores babies!  Baby dinos will no longer be thrust out into oblivion.
[*] Does not require access to tek.
[*] Does not require fuel.
[/list]

[h1]Configuration[/h1]
[b]ShieldSizeMult[/b] :: Float. Multiplies the default tek shield size by this number.  Default is 1.0.
[b]TribeLimit[/b] :: Int.  Number of shields a tribe is allowed to have.  Default is 1.
[b]Opacity[/b] :: Float. The opacity of the shield.  Default is 0.1.  1 is 100% opacity (fully visible), 0 is 0% (completely invisible)
[code]
[SafeBase]
ShieldSizeMult=1.0
TribeLimit=1
Opacity=0.1
[/code]

[h1]Technical Details[/h1]
[b]Mod ID[/b]
1235049753

[b]Item Class[/b]
[code]SB_PrimalItemStructure_Shield_C[/code]

[b]Engram Class[/b]
[code]SB_EngramEntry_Shield_C[/code]

[b]Spawn Code[/b]
[code]cheat giveitem "Blueprint'/Game/Mods/SafeBase/Items/SB_PrimalItemStructure_Shield.SB_PerimalItemStructure_Shield'" 1 1 0[/code]

[b]Engram Override[/b]
[code]OverrideNamedEngramEntries=(EngramClassName="SB_EngramEntry_Shield_C",EngramLevelRequirement=0,EngramPointsCost=0,EngramHidden=False,RemoveEngramPreReq=False)[/code]

[b]Crafting Cost Override[/b]
[code]ConfigOverrideItemCraftingCosts=(ItemClassString="SB_PrimalItemStructure_Shield_C",BaseCraftingResourceRequirements=((ResourceItemTypeString="PrimalItemResource_Thatch_C",BaseResourceRequirement=1.0,bCraftingRequireExactResourceType=True)))[/code]

[h1]Upcomin Features[/h1]
[list]
[*] Make opacity configurable in-game.  Define min and max values in ini config.
[/list]