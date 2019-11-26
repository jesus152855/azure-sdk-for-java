/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2018_10_01.implementation.ContainerInstanceManager;
import java.util.List;
import com.microsoft.azure.management.containerinstance.v2018_10_01.implementation.ContainerInner;
import com.microsoft.azure.management.containerinstance.v2018_10_01.implementation.ContainerGroupInner;

/**
 * Type representing ContainerGroup.
 */
public interface ContainerGroup extends HasInner<ContainerGroupInner>, Resource, GroupableResourceCore<ContainerInstanceManager, ContainerGroupInner>, HasResourceGroup, Refreshable<ContainerGroup>, Updatable<ContainerGroup.Update>, HasManager<ContainerInstanceManager> {
    /**
     * @return the containers value.
     */
    List<ContainerInner> containers();

    /**
     * @return the diagnostics value.
     */
    ContainerGroupDiagnostics diagnostics();

    /**
     * @return the dnsConfig value.
     */
    DnsConfiguration dnsConfig();

    /**
     * @return the identity value.
     */
    ContainerGroupIdentity identity();

    /**
     * @return the imageRegistryCredentials value.
     */
    List<ImageRegistryCredential> imageRegistryCredentials();

    /**
     * @return the instanceView value.
     */
    ContainerGroupPropertiesInstanceView instanceView();

    /**
     * @return the ipAddress value.
     */
    IpAddress ipAddress();

    /**
     * @return the networkProfile value.
     */
    ContainerGroupNetworkProfile networkProfile();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the restartPolicy value.
     */
    ContainerGroupRestartPolicy restartPolicy();

    /**
     * @return the volumes value.
     */
    List<Volume> volumes();

    /**
     * The entirety of the ContainerGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithContainers, DefinitionStages.WithOsType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ContainerGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ContainerGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ContainerGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithContainers> {
        }

        /**
         * The stage of the containergroup definition allowing to specify Containers.
         */
        interface WithContainers {
           /**
            * Specifies containers.
            */
            WithOsType withContainers(List<ContainerInner> containers);
        }

        /**
         * The stage of the containergroup definition allowing to specify OsType.
         */
        interface WithOsType {
           /**
            * Specifies osType.
            */
            WithCreate withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the containergroup update allowing to specify Diagnostics.
         */
        interface WithDiagnostics {
            /**
             * Specifies diagnostics.
             */
            WithCreate withDiagnostics(ContainerGroupDiagnostics diagnostics);
        }

        /**
         * The stage of the containergroup update allowing to specify DnsConfig.
         */
        interface WithDnsConfig {
            /**
             * Specifies dnsConfig.
             */
            WithCreate withDnsConfig(DnsConfiguration dnsConfig);
        }

        /**
         * The stage of the containergroup update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(ContainerGroupIdentity identity);
        }

        /**
         * The stage of the containergroup update allowing to specify ImageRegistryCredentials.
         */
        interface WithImageRegistryCredentials {
            /**
             * Specifies imageRegistryCredentials.
             */
            WithCreate withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials);
        }

        /**
         * The stage of the containergroup update allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             */
            WithCreate withIpAddress(IpAddress ipAddress);
        }

        /**
         * The stage of the containergroup update allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             */
            WithCreate withNetworkProfile(ContainerGroupNetworkProfile networkProfile);
        }

        /**
         * The stage of the containergroup update allowing to specify RestartPolicy.
         */
        interface WithRestartPolicy {
            /**
             * Specifies restartPolicy.
             */
            WithCreate withRestartPolicy(ContainerGroupRestartPolicy restartPolicy);
        }

        /**
         * The stage of the containergroup update allowing to specify Volumes.
         */
        interface WithVolumes {
            /**
             * Specifies volumes.
             */
            WithCreate withVolumes(List<Volume> volumes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ContainerGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDiagnostics, DefinitionStages.WithDnsConfig, DefinitionStages.WithIdentity, DefinitionStages.WithImageRegistryCredentials, DefinitionStages.WithIpAddress, DefinitionStages.WithNetworkProfile, DefinitionStages.WithRestartPolicy, DefinitionStages.WithVolumes {
        }
    }
    /**
     * The template for a ContainerGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ContainerGroup>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of ContainerGroup update stages.
     */
    interface UpdateStages {
    }
}