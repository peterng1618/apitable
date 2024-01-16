import { Strings, t } from '@apitable/core';
import { getEnvVariables } from 'pc/utils/env';

const { MAX_TRIGGER_COUNT, MAX_ACTION_COUNT } = getEnvVariables();

export const CONST_MAX_TRIGGER_COUNT = MAX_TRIGGER_COUNT;
export const CONST_MAX_ACTION_COUNT = MAX_ACTION_COUNT;

export function orDisabled<T>(arr: T[], enabled: boolean) {
  return enabled ? arr : [];
}

export const AutomationConstant = {
  DEFAULT_TEXT: t(Strings.click_start),
  defaultColor: 40,
  whiteColor: 50,
  buttonHeight: 24,
};
