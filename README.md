# SafeBase

An easy-to-craft, almost transparent force field to protect your base!  Number per tribe configurable!

## Warning
Please be arware, this is a fork of LaoArchAngel's SafeBase Mod for Ark! I just fixed a newly introduced bug (by ark itself / januar 2021) and I'm not a modder!

## Source
Origin: http://steamcommunity.com/sharedfiles/filedetails/?id=1235049753
Current: https://steamcommunity.com/sharedfiles/filedetails/?id=2363774483

## What It Does
Adds a new engram for a modified Tek Shield that is immune to damage, does not require tek engrams, and does not burn fuel.  This is perfect for PvP servers that want to allow tribes to have a small base that is completely protected.

## Features
* Clean and completely stackable.
* Shield max size is configurable.  Default max size is the same as a tek shield.
* Configurable limit on number of shields per tribe.  Default is one.
* Shield opacity is VERY low.  This means it won't look horrible in dark places, like the Aberration map.
* The shield ignores babies!  Baby dinos will no longer be thrust out into oblivion.
* Does not require access to tek.
* Does not require fuel.

## Configuration
* **ShieldSizeMult**
  * Float
  * Multiplies the default tek shield size by this number.
  * Default is 1.0.
* **TribeLimit**
  * Integer
  * Number of shields a tribe is allowed to have.
  * Default is 1.
* **MinOpacity**
  * Float
  * The minimum opacity players can set their shield. 1 is 100% opacity (fully visible), 0 is 0% (completely invisible).
  * Default is 0.
* **MaxOpacity**
  * Float
  * The maximum opacity players can set their shield. 1 is 100% opacity (fully visible), 0 is 0% (completely invisible).
  * Default is 1.

```
[SafeBase]
ShieldSizeMult=1.0
TribeLimit=1
MinOpacity=0.01
MaxOpacity=0.5
```

## Technical Details
##### Mod Id
1235049753

##### Item Class
`SB_PrimalItemStructure_Shield_C`

##### Engram Class
`SB_EngramEntry_Shield_C`

##### Spawn Code
`cheat giveitem "Blueprint'/Game/Mods/SafeBase/Items/SB_PrimalItemStructure_Shield.SB_PerimalItemStructure_Shield'" 1 1 0`

##### Engram Override
`OverrideNamedEngramEntries=(EngramClassName="SB_EngramEntry_Shield_C",EngramLevelRequirement=0,EngramPointsCost=0,EngramHidden=False,RemoveEngramPreReq=False)`

##### Crafting Cost Override
`ConfigOverrideItemCraftingCosts=(ItemClassString="SB_PrimalItemStructure_Shield_C",BaseCraftingResourceRequirements=((ResourceItemTypeString="PrimalItemResource_Thatch_C",BaseResourceRequirement=1.0,bCraftingRequireExactResourceType=True)))`
