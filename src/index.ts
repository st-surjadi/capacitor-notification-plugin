import { registerPlugin } from '@capacitor/core';

import type { PersonalNotificationPluginPlugin } from './definitions';

const PersonalNotificationPlugin = registerPlugin<PersonalNotificationPluginPlugin>('PersonalNotificationPlugin', {
  web: () => import('./web').then(m => new m.PersonalNotificationPluginWeb()),
});

export * from './definitions';
export { PersonalNotificationPlugin };
