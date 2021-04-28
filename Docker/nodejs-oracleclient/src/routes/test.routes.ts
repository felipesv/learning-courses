import { Router } from 'express';

import * as testCtrl from '../controllers/test.controller';

const router = Router();

router.get('/', testCtrl.test);

export default router;